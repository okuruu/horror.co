package horror.story.okuruu_creepypastahorrorstories;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final StoryFragment storyFragment = new StoryFragment();
        final MythFragment mythFragment = new MythFragment();
        final BlogsFragment blogsFragment = new BlogsFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.story) {
                    setFragment(storyFragment);
                    return true;
                }

                else if (id == R.id.myth) {
                    setFragment(mythFragment);
                    return true;
                }

                else if (id == R.id.blogs) {
                    setFragment(blogsFragment);
                    return true;
                }

                return false;
            }
        });

        navigationView.setSelectedItemId(R.id.story);

    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

    public void Satu(View view) {
        Intent satu = new Intent(this, Satu.class);
        startActivity(satu);
    }
}
