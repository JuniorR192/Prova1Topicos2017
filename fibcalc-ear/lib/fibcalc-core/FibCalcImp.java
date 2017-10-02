

import br.edu.univas.si8.ta.fibcalc.rest.api.CalcService;
import br.edu.univas.si8.ta.fibcalc.rest.api.Result;

public class FibCalcImpl extends FibCalc implements CalcService{


	public Result fib(int first, int second) {
		int FibCalc;
		return new Result().withFirst(first).withSecond(second).withResult(result); 
	}

}