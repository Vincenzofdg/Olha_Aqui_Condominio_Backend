//package com.br.vkcoders.olhaaquicondominio.models;
//
//import com.br.vkcoders.olhaaquicondominio.models.enums.UserRoleEnum;
//import com.br.vkcoders.olhaaquicondominio.records.UserRecord;
//import com.br.vkcoders.olhaaquicondominio.utils.CustomId;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.time.LocalDateTime;
//import java.util.Collection;
//import java.util.List;
//
//@Entity
//@Table(name = "user")
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class UserModel implements UserDetails {
//
//    @Id
//    @Column(nullable = false, updatable = false, unique = true, length = 50)
//    private String id;
//
//    @Column(nullable = false, length = 80)
//    private String email;
//
//    @Column(nullable = false, length = 20)
//    private String password;
//
//    @Column(nullable = false)
//    private UserRoleEnum role;
//
//    @CreationTimestamp
//    @Column(updatable = false)
//    private LocalDateTime createdAt;
//
//    public UserModel(UserRecord payload) {
//        this.id = CustomId.generateId();;
//        this.email = payload.email();
//        this.password = payload.password();
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return switch (this.role) {
//            case ADMIN -> List.of(
//                    new SimpleGrantedAuthority("ROLE_ADMIN"),
//                    new SimpleGrantedAuthority("ROLE_USER")
//            );
//            case USER -> List.of(new SimpleGrantedAuthority("ROLE_USER"));
//        };
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
////        return UserDetails.super.isAccountNonExpired();
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
////        return UserDetails.super.isAccountNonLocked();
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
////        return UserDetails.super.isCredentialsNonExpired();
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
////        return UserDetails.super.isEnabled();
//        return false;
//    }
//}
