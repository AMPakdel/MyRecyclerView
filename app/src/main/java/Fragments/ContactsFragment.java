package Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.packdel.myrecyclerview.Contact;
import com.example.packdel.myrecyclerview.R;
import com.example.packdel.myrecyclerview.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contacts, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        List<Contact> contacts = new ArrayList<>();


        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), fillTheList(contacts));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    List<Contact> fillTheList(List<Contact> contactList){

        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));
        contactList.add(new Contact("amir", "091180156456", R.drawable.ic_account_circle_black_24dp));

        return contactList;
    }

}
