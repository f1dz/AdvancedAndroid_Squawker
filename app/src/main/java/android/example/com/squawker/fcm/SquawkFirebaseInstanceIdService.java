package android.example.com.squawker.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import timber.log.Timber;

/**
 * Created by ofid on 8/30/17.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService{


    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Timber.d("Refreshed Token: " + refreshedToken);

        sendRegistrationToServer(refreshedToken);
    }

    /**
     *
     * @param token String
     */
    private void sendRegistrationToServer(String token){

    }
}
