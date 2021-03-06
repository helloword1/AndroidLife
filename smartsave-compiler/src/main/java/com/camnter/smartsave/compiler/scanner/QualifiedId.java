package com.camnter.smartsave.compiler.scanner;

/**
 * 封装一个具有 PackageName 的 Id
 *
 * @author CaMnter
 */

final class QualifiedId {

    final String packageName;
    final String enclosingElementName;
    final String elementSimpleName;
    final int id;


    QualifiedId(String packageName, String enclosingElementName, String elementSimpleName, int id) {
        this.packageName = packageName;
        this.enclosingElementName = enclosingElementName;
        this.elementSimpleName = elementSimpleName;
        this.id = id;
    }


    @Override
    public String toString() {
        return "QualifiedId{packageName='" + packageName + "', id=" + id + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QualifiedId)) return false;
        QualifiedId other = (QualifiedId) o;
        return id == other.id
            && packageName.equals(other.packageName);
    }


    @Override
    public int hashCode() {
        int result = packageName.hashCode();
        result = 31 * result + id;
        return result;
    }

}
