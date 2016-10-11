/**
 * Created by vilgh on 06/10/2016.
 */

package com.polytech.zguyl.iadev.environments;

import com.polytech.zguyl.iadev.*;

public class Environment5 implements IEnvironment {

    private int cpt = -1;

    @Override
    public Result react(Action action) {
        cpt++;
        if(cpt < 10){
            if(action == expected[0])
                return Result.MOVE;
            return Result.CHECK;
        }
        else if (cpt < 20){
            if(action == expected[1])
                return Result.MOVE;
            return Result.CHECK;
        }
        else if (action == expected[0])
            return Result.MOVE;
        return Result.CHECK;
    }
}
