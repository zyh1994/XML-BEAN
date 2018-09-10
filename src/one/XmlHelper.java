package one;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
/**
 * XML�İ�����
 * 
 */
public class XmlHelper
{
    /**
     * ���Զ������ݶ���ת��ΪXML�ַ���
     * 
     * @param clazz �Զ�����������
     * @param object �Զ������ݶ���
     * @return XML�ַ���
     * @throws JAXBException �쳣
     */
    public static String objectToXML(Class clazz, Object object)
        throws JAXBException
    {
        String xml = null;
        JAXBContext context = JAXBContext.newInstance(clazz);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        Writer w = new StringWriter();
        m.marshal(object, w);
        xml = w.toString();
        return xml;
    }
 
    /**
     * ��XML�ַ���ת��Ϊ�Զ������ݶ���
     * 
     * @param clazz �Զ�����������
     * @param xml XML�ַ���
     * @return �Զ������ݶ���
     * @throws JAXBException �쳣
     */
    public static Object xmlToObject(Class clazz, String xml)
        throws JAXBException
    {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller um = context.createUnmarshaller();
        return um.unmarshal(new StringReader(xml));
    }
}