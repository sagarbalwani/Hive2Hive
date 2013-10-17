package org.hive2hive.core.network.messages;

/**
 * Represents the answer of a node which is asked to handle a specific message. This reply is used to inform
 * the sender of the message as quickly as possible (synchronously) if the sent message will be handled by the
 * target node or not.
 * 
 * @author Nendor
 */
public enum AcceptanceReply {
	/** Default for 'everything is OK - I will handle this message' */
	OK,
	/** Default for 'something went wrong, I won't handle this message' */
	FAILURE,
	/**
	 * Basically used as replies for {@link AsynchronousReturnMessage}s. It indicates that there is no
	 * {@link CallBackHandler} waiting for the return message on this 'sender' node.
	 */
	NO_CALLBACK_HANDLER_FOR_THIS_MESSAGE,
	/**
	 * Indicates that the future was not successful. This means that the message could not be delivered to the
	 * target node because of some network issues
	 */
	FUTURE_FAILURE,
	/** Generic message to indicate that the message was sent to the wrong target. */
	WRONG_TARGET,
	/** A user message arrived at a node which is currently not a host for the target user. */
	USER_MESSAGE_ARRIVED_AT_WRONG_CLIENT_PEER
}