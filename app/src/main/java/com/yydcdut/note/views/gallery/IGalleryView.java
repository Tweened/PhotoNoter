package com.yydcdut.note.views.gallery;

import com.yydcdut.note.views.IView;

import java.util.ArrayList;

/**
 * Created by yuyidong on 16/4/5.
 */
public interface IGalleryView extends IView {

    void jump2SelectedDetailActivity();

    void setPreviewMenuTitle(String title);

    void notifyDataChanged(int... positions);

    void finishWithData(ArrayList<String> data);

    void finishWithoutData();

}
