import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(checkIndex2(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(checkIndex2(index)) {
            files.remove(index);
        }
    }
    
    /**
     * Comprueba que el �ndice introducido es v�lido.
     */
    public void checkIndex(int valorAIntroducir)
    {
        if (valorAIntroducir < 0 || valorAIntroducir > (files.size()-1)) {
            System.out.println("Introduzca un valor comprendido entre 0 y " + (files.size()-1));
        }
    }
    
    /**
     * Versi�n alternativa de checkIndex.
     */
    public boolean checkIndex2(int valorAIntroducir)
    {
        boolean aDevolver = true;
        if (valorAIntroducir < 0 || valorAIntroducir > (files.size()-1)) {
            aDevolver = false;
        }
        return aDevolver;
    }
}
