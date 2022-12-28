package design.practice.state;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class FeeStateMachine {

	public void enableAgreement(Long customerId, Long appId) {
		ReentrantLock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		IFeeState state = getCurrentState(customerId, appId);
		state.enableAgreement();
	}

	public void disableAgreement(Long customerId, Long appId) {

	}

	public void recharge(Long customerId, Long appId) {

	}

	public void deduct(Long customerId, Long appId) {

	}


	private IFeeState getCurrentState(Long customerId, Long appId) {
		FeeState state = FeeState.no_set;
		return FeeStateFactory.getState(state);
	}

}
