import React from "react";
import useAuth from "../hooks/useAuth";
import Header from "../components/Header";

export default function Admin() {
    const {token} = useAuth();
    return (
        <>
            <Header/>
            <h2>Admin</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}