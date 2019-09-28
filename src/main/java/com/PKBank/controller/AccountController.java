package com.PKBank.controller;

import com.PKBank.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //java REST api
@RequestMapping("api/v1/") // routing  path and version we're going to use
public class AccountController {

	//List the account from accounts
	@RequestMapping(value = "account", method = RequestMethod.GET)
	public List<Account> list() {
		return AccountStub.list();
	}

	@RequestMapping(value = "account", method = RequestMethod.POST)
	public Account create(@RequestBody Account account) {
		return AccountStub.create(account);
	}

	@RequestMapping(value = "account/{id}", method = RequestMethod.GET)
	public Account get(@PathVariable Long id) {
		return AccountStub.get(id);
	}

	@RequestMapping(value = "account/{id}", method = RequestMethod.PUT)
	public com.PKBank.model.Account update(@PathVariable Long id, @RequestBody Account account) {
		return AccountStub.update(id,account);
	}

	@RequestMapping(value = "account/{id}", method = RequestMethod.DELETE)
	public Account delete(@PathVariable Long id) {
		return AccountStub.delete(id);
	}

}
