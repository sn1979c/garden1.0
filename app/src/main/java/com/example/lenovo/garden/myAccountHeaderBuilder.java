package com.example.lenovo.garden;

import android.util.Log;

import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lenovo on 2018/3/17.
 */
//继承自开源库，修改了头像变化的次序
public class myAccountHeaderBuilder extends AccountHeaderBuilder {
    public myAccountHeaderBuilder() {
        super();
    }
    @Override

    protected boolean switchProfiles(IProfile newSelection) {
        if (newSelection == null) {
            return false;
        }
        if (mCurrentProfile == newSelection) {
            return true;
        }

        ArrayList<IProfile> previousActiveProfiles = new ArrayList<>(Arrays.asList(mCurrentProfile, mProfileFirst, mProfileSecond, mProfileThird));


            int position = -1;

            for (int i = 0; i < 3; i++) {
                if (previousActiveProfiles.get(i) == newSelection) {
                    position = i;
                    break;
                }
            }

            if (position == -1) {
                mProfileFirst = newSelection;
                mProfileSecond = previousActiveProfiles.get(2);
            }else if (position == 2){
                mProfileFirst = newSelection;
                mProfileSecond = previousActiveProfiles.get(1);
            }else {

            }
        //if we only show the small profile images we have to make sure the first (would be the current selected) profile is also shown
        Log.d("bla", String.valueOf(position));
        buildProfiles();

        return false;
    }
}