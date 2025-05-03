package com.beautyhub.authservice.dto;

import com.beautyhub.authservice.enums.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Запрос на регистрацию")
public class SignUpRequest {

    @Schema(description = "Имя", example = "Иван")
    @Size(min = 3, max = 50, message = "Имя должно содержать от 5 до 50 символов")
    @NotBlank(message = "Имя не может быть пустым")
    private String firstName;

    @Schema(description = "Фамилия", example = "Иванов")
    @Size(min = 2, max = 50, message = "Фамилия должна содержать от 2 до 50 символов")
    @NotBlank(message = "Фамилия не может быть пустой")
    private String lastName;

    @Schema(description = "Адрес электронной почты", example = "jondoe@gmail.com")
    @Size(min = 5, max = 255, message = "Адрес электронной почты должен содержать от 5 до 255 символов")
    @NotBlank(message = "Адрес электронной почты не может быть пустыми")
    @Email(message = "Email адрес должен быть в формате user@example.com")
    private String email;

    @Schema(description = "Номер телефона", example = "88888888888")
    @Size(min = 11, max = 11)
    private String phone;

    @Schema(description = "Имя пользователя", example = "jon_eslay")
    @Size(min = 5, max = 50, message = "Имя пользователя должно содержать от 5 до 50 символов")
    @NotBlank(message = "Имя пользователя не может быть пустыми")
    private String username;

    @Schema(description = "Пароль", example = "my_1secret1_password")
    @Size(max = 255, message = "Длина пароля должна быть не более 255 символов")
    private String password;


//    @Column(name = "vkId", unique = true, nullable = false)
//    private Long vkId;

    @Schema(description = "Город проживания", example = "Саратов")
    @Size(min = 5, max = 50)
    private String city;

    @Schema(description = "Роль", example = "CLIENT")
    @Enumerated(EnumType.STRING)
    private UserRole role;

}