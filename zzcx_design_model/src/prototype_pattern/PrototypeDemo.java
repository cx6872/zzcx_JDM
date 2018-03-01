package prototype_pattern;

import java.util.ArrayList;

/**
 * @version 1.00
 * @author chenxu
 * @date 2018��2��28�� ����4:27:05
 * 
 */
public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {  
        ArrayList<String> famMem = new ArrayList<>(); // ��ͥ��Ա����  
        famMem.add("Papa");  
        famMem.add("Mama");  
          
        // ������ʼ����  
        Resume resume1 = new Resume("Jobs", famMem);  
        resume1.setPersonal("Male", 26);  
        resume1.setWork("2013/8/1 - 2015/6/30", "Huawei");  
          
        // ͨ������1���Ƴ�����2�����Լ�ͥ��Ա�͹�����������޸�  
        Resume resume2 = resume1.clone();  
        resume2.setName("Tom");  
        resume2.famMem.add("Brother");  
        resume2.setWork("2015/7/1 - 2016/6/30", "Baidu");  
          
        resume1.display();  
        resume2.display();  
    }// main  
      
}/*Pritotype*/  