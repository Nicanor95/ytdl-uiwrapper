/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author nicanor
 */
public class QualityInfo extends Object
{
    private String _code;
    private String _name;
    private String _resolution;
    private String _size;

    // CONSTRUCTORES //
    public QualityInfo()
    {
        this._code = new String();
        this._name = new String();
        this._resolution = new String();
        this._size = new String();
    }

    public QualityInfo(String _code, String _name)
    {
        this._code = _code;
        this._name = _name;
        this._resolution = new String();
        this._size = new String();
    }

    public QualityInfo(String _code, String _name, String _resolution, String _size)
    {
        this._code = _code;
        this._name = _name;
        this._resolution = _resolution;
        this._size = _size;
    }

    // METODOS EXTRA //
    @Override
    public String toString()
    {
        return _size.equals("") ? _name : _name + " [" + _size + "]";
    }

    public String printingString()
    {
        return _code + "\n" + _name + "\n" + _resolution + "\n" + _size;
    }

    // GETTERS & SETTERS //
    public String getCode()
    {
        return _code;
    }

    public void setCode(String _code)
    {
        this._code = _code;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String _name)
    {
        this._name = _name;
    }

    public String getResolution()
    {
        return _resolution;
    }

    public void setResolution(String _resolution)
    {
        this._resolution = _resolution;
    }

    public String getSize()
    {
        return _size;
    }

    public void setSize(String _size)
    {
        this._size = _size;
    }

}
