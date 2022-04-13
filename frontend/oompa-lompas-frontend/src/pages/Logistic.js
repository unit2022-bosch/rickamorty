import React from "react";
import useAuth from "../hooks/useAuth";

export default function Logistic() {
    const {token} = useAuth();
    return (
        <>
            <h2>Logistic</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}