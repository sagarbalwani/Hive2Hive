package org.hive2hive.core.processes.framework.interfaces;

import java.util.List;

import org.hive2hive.core.processes.framework.ProcessState;

/**
 * Basic interface defining all common functionalities and providing the public API for all
 * process components of the framework.
 * 
 * @author Christian
 * 
 */
public interface IProcessComponent extends IControllable {

	/**
	 * Attaches an {@link IProcessComponentListener} to the process component.
	 * 
	 * @param listener The listener to be attached.
	 */
	void attachListener(IProcessComponentListener listener);

	/**
	 * Detaches an {@link IProcessComponentListener} from the process component.
	 * 
	 * @param listener The listener to be detached.
	 */
	void detachListener(IProcessComponentListener listener);

	/**
	 * Getter for the {@link IProcessComponent}'s {@link IProcessComponentListener}s.
	 * @return The {@link IProcessComponentListener}s attached to this {@link IProcessComponent}.
	 */
	List<IProcessComponentListener> getListener();
	
	/**
	 * Getter for the process component's ID.
	 * 
	 * @return The ID of the process component.
	 */
	String getID();

	/**
	 * Getter for the process component's progress.
	 * 
	 * @return The progress of the process component.
	 */
	double getProgress();

	/**
	 * Getter for the process component's parent.
	 * 
	 * @return The parent of the process component.
	 */
	ProcessState getState();

}