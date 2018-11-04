package com.one.springbootexception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("{id}/update")
	public ResultVo<Void> updateUser(@PathVariable Long id) {

		if (id.equals(1L)) {
			throw new UserNotFoundException();
		}
		return null;
	}

	@ExceptionHandler(value = {UserNotFoundException.class})
    public ResultVo<Void> handleException(UserNotFoundException e){
        return ResultVo.error(e);
    }
}