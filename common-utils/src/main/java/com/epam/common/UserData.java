package com.epam.common;

import com.epam.models.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData implements Serializable {
    private List<User> data = new ArrayList();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public void setData(User[] data) {
        this.data = Arrays.asList(data);
    }
}
