package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Issue;

public class IssueDAOImpl implements IssueDAO{
	private static Map<Integer,Issue> map = new HashMap<>();//cont + shift + O
	static 
	{
	}
	public Issue add(int bid, int sid) {
		Issue is = new Issue(bid, sid);
		int nextid;
		if(map.keySet().size() == 0) nextid = 1001;
		else nextid = Collections.max(map.keySet()) + 1;
		is.setIsid(nextid );
		map.put(nextid, is);
		return is;
	}
	public Issue update(int isid, Issue issue) {
		return null;
	}
	public Issue find(int isid) {
		return map.get(isid);
	}
	public List<Issue> findAll(){
		return new ArrayList<>(map.values());
	}
	

	// select and press control /
}
