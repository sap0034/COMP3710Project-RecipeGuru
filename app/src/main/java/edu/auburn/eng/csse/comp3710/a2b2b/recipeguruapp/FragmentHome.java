package edu.auburn.eng.csse.comp3710.a2b2b.recipeguruapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import Models.Recipe;
import Models.RecipeAdapter;


public class FragmentHome extends Fragment{
    private List<Recipe> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecipeAdapter mAdapter;
    private AppCompatActivity appCompatActivity;

    public FragmentHome(){
        setHasOptionsMenu(true);
    }
    public void onCreate(Bundle a){
        super.onCreate(a);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null, false);

        ((MainActivity)getActivity()).setupToolbar(R.id.toolbar, "DESSERT", R.color.colorNavy, R.color.colorWhiteTrans, R.drawable.RecipeGuruLogo);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        mAdapter = new RecipeAdapter(setupRecipe(), getActivity());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        mLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

//        appCompatActivity = (AppCompatActivity) getActivity();
//
//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new RecyclerTouchListener.ClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                startActivity(new Intent(getActivity(), Detail.class));
//                //Detail.navigate(appCompatActivity, view.findViewById(R.id.iv_recipe));
//            }
//
//            @Override
//            public void onLongClick(View view, int position) {
//
//            }
//        }));

        return view;
    }

    private List<Recipe> setupRecipe(){
        itemList = new ArrayList<>();
        String recipe[] = {""};
        String img[] = {""};
        float rating[] = {3, 4, 4, 3, 5, 4, 4, 3};

        for (int i = 0; i<recipe.length; i++){
            Recipe item = new Recipe();
            item.setRecipeName(recipe[i]);
            //item.setTotalTime( );
            //item.setRating(rating[i]);
            //item.setImg(img[i]);
            itemList.add(item);
        }
        return itemList;
    }


    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_home, menu);
    }
}
