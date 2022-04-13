import React from "react";
import useAuth from "../hooks/useAuth";

export default function Admin() {
    const {token} = useAuth();
    return (
        <>
            <h2>Admin</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}