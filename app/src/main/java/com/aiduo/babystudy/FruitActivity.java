package com.aiduo.babystudy;

import java.util.ArrayList;
import java.util.List;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity  {


	private ViewPager myViewPager;
	private List<Fragment> list;
	private TabFragmentPagerAdapter adapter;

	private TextView tv_indicator;

	private Button mbutton;
	private Button mbutton_a;
	private Button mbutton_b;

	private MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/////////////////////隐藏标题栏和状态栏////////////////////
		supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
		int flag= WindowManager.LayoutParams.FLAG_FULLSCREEN;
		Window window = getWindow();
		window.setFlags(flag, flag);
/////////////////////隐藏标题栏和状态栏////////////////////

		mediaPlayer = MediaPlayer.create(this, R.raw.a1);

		setContentView(R.layout.activity_fruit);
		InitView();


		mbutton = (Button) findViewById(R.id.button);
		mbutton_a = (Button) findViewById(R.id.button_a);
		mbutton_b = (Button) findViewById(R.id.button_b);

		mbutton.setOnClickListener(new ClickListener());
		mbutton_a.setOnClickListener(new ClickListener());
		mbutton_b.setOnClickListener(new ClickListener());


// 设置菜单栏的点击事件
		myViewPager.addOnPageChangeListener(new MyPagerChangeListener());

//把Fragment添加到List集合里面
		list = new ArrayList<>();
		list.add(new OneFragment());
		list.add(new TwoFragment());
		list.add(new ThreeFragment());
		list.add(new Fragment4());
		list.add(new Fragment5());
		list.add(new Fragment6());
		list.add(new Fragment7());
		list.add(new Fragment8());
		list.add(new Fragment9());
		list.add(new Fragment10());
		list.add(new Fragment11());
		list.add(new Fragment12());
		list.add(new Fragment13());
		list.add(new Fragment14());
		list.add(new Fragment15());
		list.add(new Fragment16());
		list.add(new Fragment17());
		list.add(new Fragment18());
		list.add(new Fragment19());
		list.add(new Fragment20());
		list.add(new Fragment21());
		list.add(new Fragment22());
		list.add(new Fragment23());
		list.add(new Fragment24());
		list.add(new Fragment25());
		list.add(new Fragment26());
		list.add(new Fragment27());
		list.add(new Fragment28());
		list.add(new Fragment29());
		list.add(new Fragment30());
		list.add(new Fragment31());
		list.add(new Fragment32());
		list.add(new Fragment33());
		list.add(new Fragment34());
		list.add(new Fragment35());
		list.add(new Fragment36());
		list.add(new Fragment37());
		list.add(new Fragment38());
		list.add(new Fragment39());
		list.add(new Fragment40());
		list.add(new Fragment41());
		list.add(new Fragment42());
		list.add(new Fragment43());
		list.add(new Fragment44());
		list.add(new Fragment45());
		list.add(new Fragment46());
		list.add(new Fragment47());
		list.add(new Fragment48());
		list.add(new Fragment49());
		list.add(new Fragment50());
		list.add(new Fragment51());
		list.add(new Fragment52());





		adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), list);
		myViewPager.setAdapter(adapter);
		myViewPager.setCurrentItem(0);  //初始化显示第一个页面
	}

	/**
	 * 初始化控件
	 */
	private void InitView() {
		tv_indicator = (TextView) findViewById(R.id.tv_indicator);
		myViewPager = (ViewPager) findViewById(R.id.myViewPager);
	}

	/**
	 * 点击事件
	 */
	class ClickListener implements View.OnClickListener {
		@Override
		public void onClick(View v) {
			switch (v.getId()){
				case R.id.button:
					Log.e("自定义日志提示：", "11111111111111111111日狗");
					if (mediaPlayer != null) {
						mediaPlayer.stop();
						mediaPlayer.release();
						mediaPlayer = null;
					}
					mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b1);
					mediaPlayer.start();
					break;

				case R.id.button_a:
					Log.e("自定义日志提示：", "222222222222222222222日狗");
					if (mediaPlayer != null) {
						mediaPlayer.stop();
						mediaPlayer.release();
						mediaPlayer = null;
					}
					mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c1);
					mediaPlayer.start();
					break;

				case R.id.button_b:
					Log.e("自定义日志提示：", "33333333333333333333333日狗");
					if (mediaPlayer != null) {
						mediaPlayer.stop();
						mediaPlayer.release();
						mediaPlayer = null;
					}
					mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a1);
					mediaPlayer.start();
					break;

			}
		}
	}

	/**
	 * 设置一个ViewPager的侦听事件，当左右滑动ViewPager时菜单栏被选中状态跟着改变
	 *
	 */
	public class MyPagerChangeListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			tv_indicator.setText(String.valueOf(arg0 + 1) + "/" + list.size());
		}
		/**
		 * 滑动不同页面触发不同情况
		 */
		@Override
		public void onPageSelected(int arg0) {


			if (arg0 + 1 == 1) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a1);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b1);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c1);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a1);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 2) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a2);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b2);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c2);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a2);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 3) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a3);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b3);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c3);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a3);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 4) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a4);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b4);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c4);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a4);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 5) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a5);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b5);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c5);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a5);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 6) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a6);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b6);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c6);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a6);
								mediaPlayer.start();
								break;
						}
					}
				});

			}

			if (arg0 + 1 == 7) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a7);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b7);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c7);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a7);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 8) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a8);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b8);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c8);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a8);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 9) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a9);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b9);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c9);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a9);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 10) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a10);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b10);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c10);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a10);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 11) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a11);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b11);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c11);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a11);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 12) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a12);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b12);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c12);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a12);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 13) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a13);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b13);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c13);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a13);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 14) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a14);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b14);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c14);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a14);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 15) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a15);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b15);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c15);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a15);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 16) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a16);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b16);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c16);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a16);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 17) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a17);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b17);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c17);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a17);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 18) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a18);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b18);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c18);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a18);
								mediaPlayer.start();
								break;
						}
					}
				});

			}



			if (arg0 + 1 == 19) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a19);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b19);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c19);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a19);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 20) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a20);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b20);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c20);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a20);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 21) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a21);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b21);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c21);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a21);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 22) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a22);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b22);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c22);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a22);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 23) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a23);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b23);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c23);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a23);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 24) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a24);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b24);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c24);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a24);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 25) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a25);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b25);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c25);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a25);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 26) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a26);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b26);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c26);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a26);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 27) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a27);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b27);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c27);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a27);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 28) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a28);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b28);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c28);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a28);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 29) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a29);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b29);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c29);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a29);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 30) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a30);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b30);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c30);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a30);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 31) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a31);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b31);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c31);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a31);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 32) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a32);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b32);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c32);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a32);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 33) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a33);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b33);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c33);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a33);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 34) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a34);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b34);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c34);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a34);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 35) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a35);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b35);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c35);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a35);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 36) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a36);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b36);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c36);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a36);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 37) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a37);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b37);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c37);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a37);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 38) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a38);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b38);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c38);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a38);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 39) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a39);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b39);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c39);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a39);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 40) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a40);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b40);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c40);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a40);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 41) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a41);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b41);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c41);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a41);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 42) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a42);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b42);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c42);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a42);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 43) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a43);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b43);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c43);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a43);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 44) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a44);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b44);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c44);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a44);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 45) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a45);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b45);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c45);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a45);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 46) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a46);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b46);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c46);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a46);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 47) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a47);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b47);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c47);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a47);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 48) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a48);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b48);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c48);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a48);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 49) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a49);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b49);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c49);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a49);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 50) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a50);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b50);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c50);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a50);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 51) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a51);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b51);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c51);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a51);
								mediaPlayer.start();
								break;
						}
					}
				});

			}


			if (arg0 + 1 == 52) {
				if (mediaPlayer != null) {
					mediaPlayer.stop();
					mediaPlayer.release();
					mediaPlayer = null;
				}
				mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a52);
				mediaPlayer.start();

				mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.b52);
								mediaPlayer.start();
								break;
						}
					}
				});
				mbutton_a.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_a:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.c52);
								mediaPlayer.start();
								break;
						}
					}
				});

				mbutton_b.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch (v.getId()) {
							case R.id.button_b:
								if (mediaPlayer != null) {
									mediaPlayer.stop();
									mediaPlayer.release();
									mediaPlayer = null;
								}
								mediaPlayer = MediaPlayer.create(FruitActivity.this, R.raw.a52);
								mediaPlayer.start();
								break;
						}
					}
				});

			}




		}
	}

}
