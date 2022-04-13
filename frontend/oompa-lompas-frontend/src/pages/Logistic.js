import React from "react";
import useAuth from "../hooks/useAuth";
import Header from "../components/Header";

export default function Logistic() {
    const {token} = useAuth();
    return (
        <>
            <Header/>
            <h2>Logistic</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}