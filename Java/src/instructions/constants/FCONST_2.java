package instructions.constants;

import instructions.base.NoOperandsInstruction;
import runtimedata.Zframe;

/**
 * Author: zhangxin
 * Time: 2017/5/5 0005.
 * Desc: Push float
 */
public class FCONST_2 extends NoOperandsInstruction {
    @Override
    public void execute(Zframe frame) {
        frame.getOperandStack().pushFloat(2.0f);
    }
}
