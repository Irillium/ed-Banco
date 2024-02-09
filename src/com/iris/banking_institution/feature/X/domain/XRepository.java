package com.iris.banking_institution.feature.X.domain;

import java.util.ArrayList;

public interface XRepository {
    ArrayList<X> obtainAllX();
    X obtainOneX(String xCode);
    void deleteTapa(String xCode);
    void addTapa(X x);
    void modifyTapa(String xCode,X x);
}
