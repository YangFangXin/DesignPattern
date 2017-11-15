package cn.xyf.factory;

/**
 * @author Dale
 * 志愿者工厂类
 */
public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
