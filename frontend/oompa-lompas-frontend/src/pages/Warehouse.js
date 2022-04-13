import React from "react";
import useAuth from "../hooks/useAuth";

export default function Warehouse() {
    const {token} = useAuth();
    return (
        <>
            <h2>Warehouse</h2>
            <div>Authenticated as {token}</div>
        </>
    )
}