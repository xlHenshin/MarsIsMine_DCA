package model;

import java.util.Comparator;

public class ByDate implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.getDate2().compareTo(o2.getDate2());
	}

}
