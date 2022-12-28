package design.practice.state;

public class FeeStateFactory {

	public static IFeeState getState(FeeState state) {
		IFeeState result = null;
		if (state == FeeState.no_set) {
			result =  new NoSetFeeState();
		} else if (state == FeeState.normal) {
			result = new NormalFeeState();
		} else if (state == FeeState.wait_recharge) {
			result = new WaitRechargeFeeState();
		} else if (state == FeeState.owe) {
			result = new OweFeeState();
		} else {
			throw new RuntimeException();
		}
		return result;
	}

}
