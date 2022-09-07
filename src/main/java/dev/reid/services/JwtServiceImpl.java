package dev.reid.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService{

    private Algorithm algorithm = Algorithm.HMAC256("Live long and prosper");


    @Override
    public String createJwtWithUsernameAndRole(String username, String role) {
        String jwt = JWT.create().withClaim("username", username).withClaim("role", role).sign(algorithm);
        return jwt;
    }

    @Override
    public boolean validateJwt(String jwt) {
        JWTVerifier verifier = JWT.require(algorithm).build();
        try
        {
            verifier.verify(jwt);
            return true;
        } catch (Exception e)
        {
            return false;
        }

    }
}
