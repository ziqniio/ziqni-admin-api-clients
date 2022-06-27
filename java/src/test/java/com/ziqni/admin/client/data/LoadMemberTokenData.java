package com.ziqni.admin.client.data;

import com.ziqni.admin.client.model.MemberTokenRequest;
import tests.utils.CompleteableFutureTestWrapper;

public class LoadMemberTokenData implements CompleteableFutureTestWrapper {

    public MemberTokenRequest getMemberTokenRequest(String member, String apiKey, boolean isReferenceId, int expires) {

        return new MemberTokenRequest()
                .member(member)
                .apiKey(apiKey)
                .isReferenceId(isReferenceId)
                .expires(expires);

                    }


}

