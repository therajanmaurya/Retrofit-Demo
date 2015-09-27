package dapsr.retrofitdemo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Rajan Maruya.
 * This is where all the work starts. Its like the main() function equivalent of 
 * Android devices.
 */
public class MainActivity extends AppCompatActivity {

	/**
	 * Provides the navigatio drawer (which comes in on from swiping from left edge) object.
	 */
	private DrawerLayout mDrawerLayout;

	/**
	 * First method to be called on creation of activity.
	 * 
	 * @param savedInstanceState To save the state if activity is paused/stopped.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// Calling the base class' onCreate().
		super.onCreate(savedInstanceState);

		// Setting the layout (the XML file defined in res/layout/activity_main.xml).
		setContentView(R.layout.activity_main);


		// Toolbar which shows on top of the activity.
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		// Setting navigation image to toolbar
		final ActionBar ab = getSupportActionBar();
		ab.setHomeAsUpIndicator(R.drawable.ic_menu);
		ab.setDisplayHomeAsUpEnabled(true);

		// drawerLayout initialization
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

		// Navigation view initialization
		NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
		if (navigationView != null) {
			setupDrawerContent(navigationView);
		}

		if (savedInstanceState == null) {
			Fragment view = new Fragment1();

			getSupportFragmentManager()
					.beginTransaction().replace(R.id.frame_container, view)
					.commit();

		}
	}


	//setting onclick listener to navigation list
	private void setupDrawerContent(NavigationView navigationView) {
		navigationView.setNavigationItemSelectedListener(
				new NavigationView.OnNavigationItemSelectedListener() {
					@Override
					public boolean onNavigationItemSelected(MenuItem menuItem) {

						FragmentManager fragmentManager = getSupportFragmentManager();
						android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();



						switch (menuItem.getItemId()) {
							case R.id.nav_home:
								Fragment1 home = new Fragment1();
								fragmentTransaction.replace(R.id.frame_container,
										home).commit();
								menuItem.setChecked(true);
								mDrawerLayout.closeDrawers();
								return true;
							case R.id.nav_messages:
								menuItem.setChecked(true);
								mDrawerLayout.closeDrawers();
								return true;
							case R.id.nav_friends:
								menuItem.setChecked(true);
								mDrawerLayout.closeDrawers();
								return true;
						}

						return true;
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	/**
	 * Defines what happens when one of the items from the Action Bar is selected.
	 * @param  item The item which is selected
	 * @return      [description]
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				// Open drawer if home is selected.
				mDrawerLayout.openDrawer(GravityCompat.START);
				return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
