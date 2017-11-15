package cn.xyf.MementoP;

/**
 * @author Dale
 *  备忘录类
 */
public class Memento {
	 //血量
	 private int bloodFlow;
	 //蓝值
	 private int magicPoint;
	 
	 
	//备忘录构造方法	 
	public Memento(int bloodFlow, int magicPoint) {
		super();
		this.bloodFlow = bloodFlow;
		this.magicPoint = magicPoint;
	}
	
	
	public int getBloodFlow() {
		return bloodFlow;
	}
	public void setBloodFlow(int bloodFlow) {
		this.bloodFlow = bloodFlow;
	}
	public int getMagicPoint() {
		return magicPoint;
	}
	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}
	 	 
}
