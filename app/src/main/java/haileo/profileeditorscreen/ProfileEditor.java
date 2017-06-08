package haileo.profileeditorscreen;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProfileEditor extends AppCompatActivity {
    ConstraintLayout c_Layout;
    ImageView imageView;
    FloatingActionButton floatingActionButton;
    LinearLayout lLayout1, lLayout2;
    EditText name, phone_no, email, address;
    Button ok, cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_editor);
        c_Layout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        imageView = (ImageView) findViewById(R.id.imageView);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        lLayout1 = (LinearLayout) findViewById(R.id.l_Layout1);
        lLayout2 = (LinearLayout) findViewById(R.id.l_Layout2);

        name = (EditText) findViewById(R.id.name);
        name.setEnabled(false);
        phone_no = (EditText) findViewById(R.id.phone_no);
        phone_no.setEnabled(false);
        email = (EditText) findViewById(R.id.email);
        email.setEnabled(false);
        address = (EditText) findViewById(R.id.address);
        address.setEnabled(false);



        ok = (Button) findViewById(R.id.ok);
        cancle = (Button) findViewById(R.id.cancel);

        ok.setVisibility(View.GONE);
        cancle.setVisibility(View.GONE);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view == name) {
                    name.setEnabled(false);
                } else {
                    name.setEnabled(true);
                }
                if (view == phone_no) {
                    phone_no.setEnabled(false);
                } else {
                    phone_no.setEnabled(true);
                }
                if (view == email) {
                    email.setEnabled(false);
                } else {
                    email.setEnabled(true);
                }
                if (view == address) {
                    address.setEnabled(false);
                } else {
                    address.setEnabled(true);
                }
                Snackbar.make(view, "Now Enter your details ",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                ok.setVisibility(View.VISIBLE);
                cancle.setVisibility(View.VISIBLE);

                floatingActionButton.setVisibility(View.GONE);

                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        floatingActionButton.setVisibility(View.VISIBLE);

                        ok.setVisibility(View.GONE);
                        cancle.setVisibility(View.GONE);

                        name.setEnabled(false);

                        phone_no.setEnabled(false);

                        email.setEnabled(false);

                        address.setEnabled(false);
                    }
                });

            }
        });

    }
}
