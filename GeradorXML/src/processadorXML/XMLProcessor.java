package processadorXML;

import java.lang.reflect.Field;

public class XMLProcessor {

    public static String generateXMLBody(Object o) throws Exception{
        StringBuilder str = new StringBuilder();

        str.append("<" + o.getClass().getSimpleName()+">\n");

        Field[] atributos = o.getClass().getDeclaredFields();

        for(Field atr : atributos){
            if(!atr.canAccess(o)){
                atr.setAccessible(true);
            }
            switch(atr.getType().getName()){
                case "int":
                case "double":
                case "float":
                case "java.lang.String":
                    str.append("<"+ atr.getName()+">" + atr.get(o) + "</" + atr.getName() + ">\n");
                    break;
                default: // Se é um objeto
                    str.append(generateXMLBody(atr.get(o)));
            }

        }
        str.append("</" + o.getClass().getSimpleName() + ">");



        return str.toString();
    }

    public static String generateXML(Object o) throws Exception{
        return "<xml version=\"1.0\">\n"+generateXMLBody(o)+"\n</xml>";
    }
}
