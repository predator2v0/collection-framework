package comparableComparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile m1, Mobile m2) {
		// TODO Auto-generated method stub
		if(m1.getId() > m2.getId()) {
			return 1;
		} else if(m1.getId() < m2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
		
}
