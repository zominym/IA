/**
 * Created by Vil on 11/10/2016.
 */

package com.polytech.zguyl.iadev.motivations;

import com.polytech.zguyl.iadev.*;

public class Motivation2 implements IMotivation {
    @Override
    public int evaluate(Interaction interaction) {
        if(interaction.getResult() == Result.CHECK)
            return 1;
        return -1;
    }
}