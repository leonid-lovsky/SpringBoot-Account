package account.auth.dto.request;

public record RegisterRequest(
    String username,
    String email,
    String phone,
    String password
) {

}
