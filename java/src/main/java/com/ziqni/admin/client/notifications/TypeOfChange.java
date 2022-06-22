/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.notifications;

public abstract class TypeOfChange {

    public final static int CREATED = 1;
    public final static int UPDATED = 2;
    public final static int DELETED = 3;
    public final static int STATE_CHANGED = 10;
}
