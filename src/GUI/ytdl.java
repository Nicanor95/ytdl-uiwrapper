/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author nicanor
 */
public class ytdl
{
	public static void getVideo(String URL, ArrayList Options, String Output, JProgressBar progressBar, JLabel speedLabel, JTextArea outputArea)
	{
		ArrayList _comArray = new ArrayList();
		if (System.getProperty("os.name").contains("Windows"))
			_comArray.add("./youtube-dl.exe");
		else
			_comArray.add("youtube-dl");
		_comArray.addAll(Options);
		_comArray.add(URL);
		_comArray.add("-o");
		_comArray.add(Output);

		try
		{
			Process yt_dl = new ProcessBuilder().command(_comArray).inheritIO().redirectErrorStream(true).redirectOutput(ProcessBuilder.Redirect.PIPE).start();
			
			BufferedReader _reader = new BufferedReader(new InputStreamReader(yt_dl.getInputStream()));
			String line;
			
			progressBar.setMinimum(0);
			progressBar.setMaximum(100);
			Float value;
			
			while ((line = _reader.readLine()) != null)
			{
				outputArea.append(line + "\n");
				//Autoscroll:
				outputArea.setCaretPosition(outputArea.getDocument().getLength() - 1);
				
				if (line.contains("[download]") && !line.contains("Destination"))
				{
					for (String x : line.split(" "))
					{
						if(x.contains("%"))
						{
							value = Float.parseFloat(x.trim().replaceAll("%", ""));
							progressBar.setValue(value.intValue());
						}
						if(x.contains("/s"))
							speedLabel.setText(x.trim());
					}
				}
			}
			speedLabel.setText("Listo!");
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "Error en la ejecucion de youtube-dl. ERROR: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
}
