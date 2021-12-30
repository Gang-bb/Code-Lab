package com.gangbb.delombok;

/**
 * TODO:deprecated
 *
 * @author Gangbb
 * @date 2021/12/30
 */
public class User2 {
    private String name;
    private String email;


    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public static class User2Builder {
        @SuppressWarnings("all")
        private String name;
        @SuppressWarnings("all")
        private String email;

        @SuppressWarnings("all")
        User2Builder() {
        }

        @SuppressWarnings("all")
        public User2.User2Builder name(final String name) {
            this.name = name;
            return this;
        }

        @SuppressWarnings("all")
        public User2.User2Builder email(final String email) {
            this.email = email;
            return this;
        }

        @SuppressWarnings("all")
        public User2 build() {
            return new User2(this.name, this.email);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "User2.User2Builder(name=" + this.name + ", email=" + this.email + ")";
        }
    }

    @SuppressWarnings("all")
    public static User2.User2Builder builder() {
        return new User2.User2Builder();
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getEmail() {
        return this.email;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User2)) return false;
        final User2 other = (User2) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof User2;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "User2(name=" + this.getName() + ", email=" + this.getEmail() + ")";
    }

    @SuppressWarnings("all")
    public User2() {
    }

    @SuppressWarnings("all")
    public User2(final String name, final String email) {
        this.name = name;
        this.email = email;
    }
    //</editor-fold>
}
