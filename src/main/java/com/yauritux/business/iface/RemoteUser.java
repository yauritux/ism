package com.yauritux.business.iface;

import javax.ejb.Remote;

import com.yauritux.domain.User;

@Remote
public interface RemoteUser {

	User getUserById(String userId);
}
