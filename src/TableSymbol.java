import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TableSymbol {
    private Map<String, Element> ts = new HashMap<>();

    public Map<String, Element> getTs() {
        return ts;
    }

    public  boolean addElement(String name, Boolean declared, String type, float valeur)
    {
        Element e= new Element(name,declared,type,valeur);
        Element n=ts.get(name);
        if(n!=null)
        {
            return false;
        }
        ts.put(e.getName(),e);
        return true ;

    }



    public Element get_Element(String name )
    {
        return (ts.get(name));
    }
    public boolean delete_element(String name )
    {
        Element n=ts.get(name);
        if(n!=null)
        {
            return false;
        }
        ts.remove(n.getName());
        return true;
    }
    public void afficherTs ()
    {
     Set listkey =ts.keySet();
     for (Object i :listkey) System.out.println(i + " " + ts.get(i));
    }

}
