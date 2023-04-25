package org.example.usersservice.dto.users;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Value
@Jacksonized
@Builder
public class CreateUserDto {
    @NotNull
    @Email
    String email;
    @NotNull
    String password;
    @NotNull
    String role;
}
