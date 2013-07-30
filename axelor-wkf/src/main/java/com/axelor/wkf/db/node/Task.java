package com.axelor.wkf.db.node;

import javax.persistence.Entity;

import com.axelor.db.JPA;
import com.axelor.db.Query;
import com.axelor.wkf.db.Node;

@Entity
public class Task extends Node {
	
	/**
	 * Find a <code>Task</code> by <code>id</code>.
	 *
	 */
	public static Task find(Long id) {
		return JPA.find(Task.class, id);
	}
	
	/**
	 * Return a {@link Query} instance for <code>Task</code> to filter
	 * on all the records.
	 *
	 */
	public static Query<Task> allTask() {
		return JPA.all(Task.class);
	}
	
	/**
	 * A shortcut method to <code>Task.all().filter(...)</code>
	 *
	 */
	public static Query<Task> filterTask(String filter, Object... params) {
		return JPA.all(Task.class).filter(filter, params);
	}

}
