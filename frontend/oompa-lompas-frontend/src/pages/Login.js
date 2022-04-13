import useAuth from "../hooks/useAuth";

export default function Login() {
    const {onLogin} = useAuth();
    return (
        <>
            <h2>Login</h2>
            <button type="button" onClick={onLogin}>
                Sign In
            </button>
        </>
    )
}