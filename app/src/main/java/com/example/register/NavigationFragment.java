package com.example.register;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class NavigationFragment<setImageResource> extends Fragment implements View.OnClickListener {

    private LinearLayout tabItemHome;
    private LinearLayout tabItemCategory;
    private LinearLayout tabItemCart;
    private LinearLayout tabItemPersonal;
    private LinearLayout tabItemPersonalBtn;
    private LinearLayout tabItemHomeBtn;
    private LinearLayout tabItemCategoryBtn;
    private LinearLayout tabItemCartBtn;
    private FragmentManager fragmentManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_navigation,container,false);
        initViews(view);

        return view;
    }

    //初始化视图对象
    private void initViews(View view){
        //主页面
        tabItemHome = (LinearLayout)view.findViewById(R.id.tab_item_home);
        //注册点击事件
        tabItemHome.setOnClickListener(this);
        //分类页面
        tabItemCategory = (LinearLayout)view.findViewById(R.id.tab_item_category);
        tabItemCategory.setOnClickListener(this);
        //购物车页面
        tabItemCart = (LinearLayout)view.findViewById(R.id.tab_item_cart);
        tabItemCart.setOnClickListener(this);
        //个人中心页面
        tabItemPersonal = (LinearLayout)view.findViewById(R.id.tab_item_personal);
        tabItemPersonal.setOnClickListener(this);

        tabItemPersonalBtn =  view.findViewById(R.id.tab_item_personal_btn);
        tabItemPersonalBtn.setOnClickListener(this);

        tabItemCategoryBtn = view.findViewById(R.id.tab_item_category_btn);
        tabItemCategoryBtn.setOnClickListener(this);

        tabItemCartBtn = view.findViewById(R.id.tab_item_cart_btn);
        tabItemCartBtn.setOnClickListener(this);

        tabItemHomeBtn = view.findViewById(R.id.tab_item_home_btn);
        tabItemHomeBtn.setOnClickListener(this);

        //获得Fragment管理对象
       fragmentManager = getFragmentManager();



    }

    public void onClick(View v) {
        setTableSelection(v.getId());

    }
    private void setTableSelection(int id) {   //重置所有TabItem状态
//        tabItemHomeBtn.setImageResource(R.drawable.ic_r_home);
//        tabItemCategoryBtn.setImageResource(R.drawable.ic_w_tab2);
//        tabItemCartBtn.setImageResource(R.drawable.ic_w_cart);
//        tabItemPersonalBtn.setImageResource(R.drawable.ic_w_mind);
//        //开启一个事物
//        FragmentManagerTransaction fragmentManagerTransaction = fragmentManager.beginTransaction();
//        //影藏所有Fragment
//        if (HomeFragment !=null){
//            fragmentManagerTransaction.hide(HomeFragment);
//            if (CategoryFragment !=null){
//                fragmentManagerTransaction.hide(CategoryFragment);
//                if (CartFragment !=null){
//                    fragmentManagerTransaction.hide(CartFragment);
//                    if (PersonFragment != null){
//                        fragmentManagerTransaction.hide(PersonFragment);
//
//                        //根据tabItem的id来执行不同的操作
//                        switch (id){
//                            case R.id.tab_item_home:
//
//                        }
//                    }
//                }
//            }
//        }

    }
}
