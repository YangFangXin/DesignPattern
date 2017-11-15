package cn.xyf.MementoP;

public class Client {

	public static void main(String[] args) {
		 //打BOSS之前：血、蓝全部满值  
        Role role = new Role(200, 200);  
        System.out.println("----------大战BOSS之前----------");  
        role.display();
        
        //保持进度  (使用负责人对象注入了一个备忘录对象保存进度)
        Caretaker caretaker = new Caretaker();  
        caretaker.memento = role.saveMemento();
        
        //大战BOSS，快come Over了  
        role.setBloodFlow(15);  
        role.setMagicPoint(15);  
        System.out.println("----------大战BOSS----------");  
        role.display();
        
        //恢复存档  
        role.restoreMemento(caretaker.getMemento());  
        System.out.println("----------恢复----------");  
        role.display();  
        
	}

}
