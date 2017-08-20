package dennymades.space.climoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.climoji_grid) RecyclerView climojiGrid;

    private ClimojiAdapter climojiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        climojiAdapter = new ClimojiAdapter(getApplicationContext(), this);
        climojiGrid.setLayoutManager(new GridLayoutManager(this, 2));
        climojiGrid.setAdapter(climojiAdapter);
    }
}