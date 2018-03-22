package view_sys;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cache {
	
	private int numItems;
	private Map<Integer, CachedObject> repo; // Key is the class number
	
	public Cache() {
		this.numItems = 0;
		this.repo = new HashMap<>();
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public Map<Integer, CachedObject> getRepo() {
		return repo;
	}

	public void setRepo(Map<Integer, CachedObject> repo) {
		this.repo = repo;
	}
	
	public void addItem(ClassData c) {
		if(!this.repo.containsValue(c)) {
			CachedObject co = new CachedObject(c, c.hashCode(), ClassData.TTL);
			this.repo.put(c.getClassID(), co);
		}
	}
	
	public int checkForExpiredItems() {
		int numItemsRemoved = 0;
		
		Iterator it = this.repo.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			
			if(((CachedObject)pair.getValue()).isExpired()) {
				this.repo.remove(pair.getKey());
				numItemsRemoved++;
			}
		}
		
		return numItemsRemoved;
	}
	
	public void removeItem(ClassData item) {
		if(this.repo.containsValue(item)) {
			this.repo.remove(item.getClassID());	
		}
	}
	
}
