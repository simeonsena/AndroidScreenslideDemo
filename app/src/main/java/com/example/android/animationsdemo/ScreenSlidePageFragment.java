/*
 * Copyright 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.animationsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link CardFlipActivity} and {@link
 * ScreenSlideActivity} samples.</p>
 */
public class ScreenSlidePageFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    public String getTestText(int page) {

       String location = "Oakley";
        switch (page) {
            case 1:
                location = "Florence";
                break;
            case 2:
                location = "Mason";
                break;
            case 3:
                location = "Oxford";
                break;
            case 4:
                location = "Uptown";
                break;
            case 5:
                location = "West Side";
                break;
            case 6:
                location = "Andover";
                break;
            case 7:
                location = "Georgetown";
                break;
            case 8:
                location = "Richmond";
                break;


        }
        return location;
    }
    public String getBodyText(int page) {

        String bodyText = "Oakley Text";
        switch (page) {
            case 1:
                bodyText = "Florence+Text";
                break;
            case 2:
                bodyText = "Mason text";
                break;
            case 3:
                bodyText = "OxfordText";
                break;
            case 4:
                bodyText = "UptownTestt";
                break;
            case 5:
                bodyText = "West Sidetesst";
                break;
            case 6:
                bodyText = "AndoverTesttt";
                break;
            case 7:
                bodyText = "GeorgetownTeest";
                break;
            case 8:
                bodyText = "RichmondTttesst";
                break;


        }
        return bodyText;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);
        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getTestText(mPageNumber)); //  getString(R.string.title_template_step, mPageNumber + 1));
        ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                getBodyText(mPageNumber));
        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
